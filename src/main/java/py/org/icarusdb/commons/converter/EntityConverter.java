package py.org.icarusdb.commons.converter;

import java.util.HashMap;
import java.util.Map;

import javax.faces.context.FacesContext;

/**
 * @author ievans
 * from duke's store example
 * 
 * adapted by @author rgamarra
 */
public class EntityConverter
{

    private static final String key = "org.pti.converter.EntityConverter";

    public EntityConverter() { }

    protected Map<String, Object> getViewMap(FacesContext context)
    {
        Map<String, Object> viewMap = context.getViewRoot().getViewMap();
        @SuppressWarnings({ "unchecked", "rawtypes" })
        Map<String, Object> idMap = (Map) viewMap.get(key);
        if (idMap == null)
        {
            idMap = new HashMap<String, Object>();
            viewMap.put(key, idMap);
        }
        return idMap;
    }
}
