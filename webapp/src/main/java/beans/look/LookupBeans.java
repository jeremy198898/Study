package beans.look;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Created by jeremy on 2016/6/28.
 */
public class LookupBeans
{
    // Since we haven't deployed the application as a .ear, the app name for us will be an empty string
    final String appName = "redtree";
    final String moduleName = "core";
    final String prefixLookup = "java:global";

    /**
     * Looks up and returns the proxy to remote stateless calculator bean
     * The interface name is required only if the enterprise bean implements more than one business interface.
     * @param beanName can be interface or beanEJB
     * @return beanObject
     * @throws NamingException
     */
    public Object lookupBean(String beanName) throws NamingException
    {
        Object obj = null;
        InitialContext ctx = new InitialContext();
        obj = ctx.lookup(prefixLookup+"/"+appName+"/"+moduleName+"/"+beanName);
        return obj;
    }
}
