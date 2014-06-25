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

import java.util.Map;

import py.org.icarusdb.commons.parameter.GlobalParameters;

/**
 * @author Betto McRose [icarus]
 *         mcrose@icarusdb.com.py
 *         mcrose.dev@gmail.com
 *
 */
public class UriBuilder
{
    /**
     * builds an URI with the given properties<br>
     * 
     * {@link GlobalParameters}.REST_AUTH_KEY_SERVERADDRESS<br>
     * {@link GlobalParameters}.REST_AUTH_KEY_SERVICENAME<br>
     * {@link GlobalParameters}.REST_AUTH_KEY_LOGINPATH<br>
     * must be present
     * 
     * @param properties
     * @return
     */
    public static String buildLoginUri(IDBProperties properties)
    {
        String server = (String) properties.get(GlobalParameters.REST_AUTH_KEY_SERVER);
        String port = (String) properties.get(GlobalParameters.REST_AUTH_KEY_PORT);
        String moduleName = (String) properties.get(GlobalParameters.REST_AUTH_KEY_MODULENAME);
        String serviceName = (String) properties.get(GlobalParameters.REST_AUTH_KEY_SERVICENAME);
        String loginPath = (String) properties.get(GlobalParameters.REST_AUTH_KEY_LOGINPATH);
        
        return "http://" + server + ":"+port + "/"+moduleName + serviceName + loginPath;
    }
    
    public static String buildUri(Map<String, String> connInfo, String serviceModuleName)
    {
        return buildUri(new IDBProperties(connInfo), serviceModuleName);
    }
    
    public static String buildUri(IDBProperties properties, String serviceModuleName)
    {
        String server = (String) properties.get(GlobalParameters.REST_KEY_SERVER);
        String port = (String) properties.get(GlobalParameters.REST_KEY_PORT);
        String moduleName = (String) properties.get(GlobalParameters.REST_KEY_MODULENAME);
        String serviceName = (String) properties.get(GlobalParameters.REST_KEY_SERVICENAME);
        
        if(!AppBaseHelper.nothing(serviceModuleName))
        {
            serviceModuleName = (String) properties.get(serviceModuleName);
        }
        
        return "http://" + server + ":"+port + "/" + moduleName + serviceName + serviceModuleName;
    }
    
    public static String buildUri(String uri)
    {
        if(!uri.startsWith("http://")) 
        {
            uri = "http://" + uri;
        }
        
        return uri;
    }

    
}
