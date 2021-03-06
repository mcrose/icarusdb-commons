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
package py.org.icarusdb.commons.parameter;

/**
 * @author Betto McRose [icarus]
 *         mcrose@icarusdb.com.py
 *         mcrose.dev@gmail.com
 *
 */
public class GlobalParameters
{
    public static final String CONVERSION_ERROR_MESSAGE_ID = "ConversionError";    

    public static final int SEARCH_MAX_RESULT = 10;
    
    public static final String REST_AUTH_KEY_SERVER = "server";
    public static final String REST_AUTH_KEY_PORT = "port";
    public static final String REST_AUTH_KEY_MODULENAME="moduleName";
    public static final String REST_AUTH_KEY_SERVICENAME = "serviceName";
    public static final String REST_AUTH_KEY_LOGINPATH = "loginPath";
    public static final String REST_AUTH_KEY_ACTIVEUSERS = "activeUsers";
    
    public static final String REST_MAIN_CONFIG_FILE_FOLDER = "WEB-INF/lib";
    
    public static final String REST_KEY_SERVER = "server";
    public static final String REST_KEY_PORT = "port";
    public static final String REST_KEY_MODULENAME = "moduleName";
    public static final String REST_KEY_SERVICENAME = "serviceName";
    

    public static final int RESPONSE_ERROR_LOGIN_FAILED = 1001;
    public static final int RESPONSE_ERROR_REGISTERED_USER = 1002;
    public static final int RESPONSE_ERROR_ACTIVE_USER = 1003;
    public static final int RESPONSE_ERROR_CONNECTION = 2001;
    public static final int RESPONSE_ERROR_CONFIGURATION = 2002;
    
    
    public static final String COMBOBOX_DESCRIPTOR = "comboBoxDescriptor";
    public static final String DESCRIPTION_DESCRIPTOR = "description";
    
    
    public static final String YES = "msg_yes";
    public static final String NO = "msg_no";
    
    public static final String SERVLET_CONTENT_DISPOSITION_ATTACHAMENT = "attachament";
    public static final String SERVLET_CONTENT_DISPOSITION_INLINE = "inline";
    
    public static final String CREATE_USER = "CREATE_USER";
    public static final String CREATE_DATE = "CREATE_DATE";
    public static final String UPDATE_USER = "UPDATE_USER";
    public static final String UPDATE_DATE = "UPDATE_DATE";

    public static final String ID = "id";
    public static final String SELECTED = "SELECTED";
    
    public static final String BASE_BUNDLE_URL = "py.com.icarusdb.messages.CommonMessages";

}
