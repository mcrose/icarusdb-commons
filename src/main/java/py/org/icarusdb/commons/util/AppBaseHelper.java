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

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/**
 * @author Betto McRose [icarus]
 *         mcrose@icarusdb.com.py
 *         mcrose.dev@gmail.com
 *
 */
public class AppBaseHelper
{
    /**
     * retrieves a String in (x, x, x) format to be used in a SQL IN statement
     * 
     * @param collection
     * @return
     */
    public static String getInList(List<?> collection)
    {
        if(collection == null || collection.isEmpty()) return null;
        
        String listIn = "(";
        for(Object element : collection)
        {
            listIn += "'"+element.toString() + "', ";
        }
        
        listIn = listIn.substring(0, listIn.length()-2);
        
        return listIn + ")";
    }
    
    /**
     * {@link java.util.Set} implementation of getInList()
     * 
     * @param collection
     * @return
     */
    public static String getInList(Set<?> collection)
    {
        List<Object> list = new LinkedList<Object>();
        
        Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext())
        {
            list.add(iterator.next());
        }
        
        return getInList(list);
    }
    
    
    public static String prepareString(List<?> collection, String separator)
    {
        if(collection == null || collection.isEmpty()) return null;
        
        String list = "";
        for(Iterator<?> iter = collection.iterator(); iter.hasNext();)
        {
            list += iter.next().toString() + separator;
        }
        
        list = list.substring(0, list.length()-1);
        
        return list;
    }
    
    public static String stripMillar(Object value)
    {
        String stringval = "";
        
        String millarpoint = specialCharsStringBuilder(value);
        
        String[] split = value.toString().trim().split(millarpoint);
        for(int index=0; index < split.length; index++)
        {
            stringval += split[index];
        }
        
        return stringval;
    }
    
    public static String specialCharsStringBuilder(Object value)
    {
        String spacialchar = "";
        if(value.toString().contains("."))
        {
            spacialchar = "\\.";
        } 
        else if(value.toString().contains(","))
        {
            spacialchar = "\\,";
        }
        return spacialchar;
    }
    
    /**
     * checks for the given String if it has any values
     * 
     * @param string
     * @return
     */
    public static boolean nothing(String string)
    {
        return string==null||string.isEmpty();
    }

    public static String formatNumber(Object value, Locale locale)
    {
        NumberFormat nf = NumberFormat.getNumberInstance(locale);
        
        String sval = new String(value.toString());
        if(sval.contains("(")) {
            String[] split = sval.split("\\(");
            sval = split[1];
        }
        if(sval.contains(")")) {
            String[] split = sval.split("\\)");
            sval = split[0];
        }
        
        return nf.format(new BigDecimal(sval));
    }

//    public static String getRESTfullConfig(String serviceModuleName, String cfgFileName, String projectCfgPath) throws FileNotFoundException, IOException
//    {
//        return UriBuilder.buildUri(FileHelper.loadConfigParams(cfgFileName, projectCfgPath), serviceModuleName);
//    }
    
}
