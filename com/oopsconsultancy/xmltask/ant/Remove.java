package com.oopsconsultancy.xmltask.ant;

import com.oopsconsultancy.xmltask.*;

/**
 * the Ant removal task
 * 
 * @author <a href="mailto:brian@oopsconsultancy.com">Brian Agnew</a>
 * @version $Id: Remove.java,v 1.4 2006/11/01 22:40:38 bagnew Exp $
 */
public class Remove implements Instruction {

  private String path = null;

  private String ifProperty;

  private String unlessProperty;

  public void setPath(String path) {
    this.path = path;
  }

  public void process(final XmlTask task) {
    XmlReplace xmlReplace = new XmlReplace(path, new RemovalAction());
    xmlReplace.setIf(ifProperty);
    xmlReplace.setUnless(unlessProperty);
    task.add(xmlReplace);
  }

  /**
   * sets a property determining execution
   * 
   * @param ifProperty
   */
  public void setIf(final String ifProperty) {
    this.ifProperty = ifProperty;
  }

  /**
   * sets a property determining execution
   * 
   * @param unlessProperty
   */
  public void setUnless(final String unlessProperty) {
    this.unlessProperty = unlessProperty;
  }
}
