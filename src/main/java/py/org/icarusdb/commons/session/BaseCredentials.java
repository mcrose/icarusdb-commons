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
package py.org.icarusdb.commons.session;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

/**
 * @author Betto McRose [icarus]
 *         mcrose@icarusdb.com.py
 *         mcrose.dev@gmail.com
 *
 */
public class BaseCredentials implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = -5239334795394463901L;
    
    protected String ipAddr;
    protected String username;
    protected String password;
    
    protected Properties parameters = null;
    
    protected List<String> roles = null;
    
    
    
    
    public void init()
    {
        ipAddr = null;
        username = null;
        password = null;
        parameters = new Properties();
        roles = new LinkedList<String>();
    }

    public String getIpAddr()
    {
        return ipAddr;
    }
    
    public void setIpAddr(String ipAddr)
    {
        this.ipAddr = ipAddr;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public Properties getParameters()
    {
        return parameters;
    }
    
    public void setParameters(Properties parameters)
    {
        this.parameters = parameters;
    }
    
    public void addParamenter(String key, Object value)
    {
        parameters.put(key, value);
    }

    public void addRole(String rol)
    {
        roles.add(rol);
    }
    
    public boolean hasRol(String rol)
    {
        return roles.contains(rol);
    }
 
    public List<String> getRoles()
    {
        return roles;
    }
    
    public void setRoles(List<String> rols)
    {
        this.roles = rols;
    }

}