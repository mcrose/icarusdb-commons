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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;



import py.org.icarusdb.commons.exception.IDBException;
import py.org.icarusdb.commons.util.ServerConfiguracionHelper;

/**
 * @author Betto McRose [icarus]
 *         mcrose@icarusdb.com.py
 *         mcrose.dev@gmail.com
 *
 */
public class FileHelper
{
    // TODO make logging app-server independent
//import org.jboss.logging.Logger;
//import org.jboss.logging.Logger.Level;
//    private static Logger logger = Logger.getLogger(FileHelper.class);
    
    /**
     * @author Pedro Flores [neowinx]
     *         pflores@codelab.com.py
     * @param is
     * @param filename
     * @param path
     * @return
     * @throws IDBException
     */
    public static boolean writeFile(InputStream is, String filename, String path) throws IDBException
    {

        File fileDir = new File(path);
        if (!fileDir.exists())
        {
            fileDir.mkdir();
        }

        String file = fileDir + File.separator + filename;

        try
        {
            FileOutputStream out = new FileOutputStream(new File(file));

            int c;
            while ((c = is.read()) != -1)
            {
                out.write(c);
            }
            is.close();
            out.close();
        }
        catch (IOException e)
        {
//            logger.log(Level.DEBUG, FileHelper.class.getName(), e);
            throw new IDBException(e);
        }

        return true;
    }

    public static boolean writeFile(byte[] data, String filename, String path) throws IDBException
    {
        return writeFile(new ByteArrayInputStream(data), filename, path);
    }

    
    public static IDBProperties loadConfigParams(String cfgFileName, String projectCfgPath) throws FileNotFoundException, IOException
    {
        String filepath = System.getProperty(ServerConfiguracionHelper.JBOSS7_JBOSS_SERVER_CONFIG_DIR) + 
                            File.separator + projectCfgPath + File.separator + cfgFileName;
        
        IDBProperties parameteres = new IDBProperties();
        parameteres.load(new FileInputStream(filepath));
        
        return parameteres;
    }
    
//    public static IDBProperties loadConfigParams(String cfgFileName) throws FileNotFoundException, IOException
//    {
//        String filepath = System.getProperty(ServerConfiguracionHelper.JBOSS7_JBOSS_SERVER_CONFIG_DIR) + 
//                            File.separator + ServerConfiguracionHelper.JBOSS7_JBOSSSERVER_IDB_CONN_CONFIG_DIR +
//                            File.separator + cfgFileName;
//        
//        IDBProperties parameteres = new IDBProperties();
//        parameteres.load(new FileInputStream(filepath));
//        
//        return parameteres;
//    }
        
    
    
}
