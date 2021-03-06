package com.oopsconsultancy.xmltask;
 
import org.w3c.dom.*;

/** 
 * removes the nominated node and its children
 * 
 * @author <a href="mailto:brian@oopsconsultancy.com">Brian Agnew</a>
 * @version $Id: RemovalAction.java,v 1.2 2003/08/08 21:01:49 bagnew Exp $
 */
public class RemovalAction extends Action {

  public RemovalAction() {
  }

  public boolean apply(Node node) throws Exception {
    remove(node);
    return true;
  }

  public String toString() {
    return "RemovalAction()";
  }
}

