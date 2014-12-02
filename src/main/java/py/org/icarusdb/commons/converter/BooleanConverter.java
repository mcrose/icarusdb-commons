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
package py.org.icarusdb.commons.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import py.org.icarusdb.commons.util.BundleHelper;

/**
 * @author Betto McRose [icarus]
 *         mcrose@icarusdb.com.py
 *         mcrose.dev@gmail.com
 *
 */
public class BooleanConverter extends javax.faces.convert.BooleanConverter 
{
    @Override
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2)
    {
        return super.getAsObject(arg0, arg1, arg2);
    }
    
    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2)
    {
        String value = super.getAsString(arg0, arg1, arg2);
        
        if(value.isEmpty() || value.equalsIgnoreCase("false")) {
            value = "label.no";
        } else {
            value = "label.yes";
        }
        
        return BundleHelper.getBundleMessage(value);
    }
}
