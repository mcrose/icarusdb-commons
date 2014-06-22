/**
 * Copyright 2014 Roberto Gamarra [icarus] ** ( Betto McRose  )
 *                mcrose@icarusdb.com.py | mcrose.dev@gmail.com
 *                
 * as you wish... at your service ;-P
 * 
 * IcarusDB.com.py
 *            
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package py.org.icarusdb.commons.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * @author Betto McRose [icarus]
 *         mcrose@icarusdb.com.py
 *         mcrose.dev@gmail.com
 *         
 * based on WPGProperties
 *         http://www.wpgsoftware.nl/
 */
public class IDBProperties extends Properties
{
    /**
     * 
     */
    private static final long serialVersionUID = -5688930542675465146L;
    
    private final static String NULL = "null";

    public IDBProperties()
    {
    }

    public IDBProperties(IDBProperties properties)
    {
        if (properties != null)
        {
            addProperties(properties);
        }
    }

    public IDBProperties(Map<?, ?> map)
    {
        if (map != null)
        {
            addProperties(map);
        }
    }

    private void addProperties(IDBProperties properties)
    {
        Iterator<Object> iterator = properties.keySet().iterator();
        while (iterator.hasNext())
        {
            Object key = iterator.next();
            Object value = properties.get(key);

            super.put(key, value == null ? NULL : value);
        }
    }

    private void addProperties(Map<?, ?> map)
    {
        Iterator<?> iterator = map.keySet().iterator();
        while (iterator.hasNext())
        {
            Object key = iterator.next();
            Object value = map.get(key);

            super.put(key, value == null ? NULL : value);
        }

    }

    @Override
    public synchronized Object get(Object key)
    {
        Object value = super.get(key);
        return (value == null || NULL.equals(value)) ? null : value;
    }

    @Override
    public synchronized Object put(Object key, Object value)
    {
        return super.put(key, value == null ? NULL : value);
    }

}
