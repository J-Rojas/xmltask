package com.oopsconsultancy.xmltask.ant;

import com.oopsconsultancy.xmltask.PrintAction;
import com.oopsconsultancy.xmltask.XmlReplace;

/**
 * allows diagnostic printing of path matching, buffers etc.
 *
 * @author <a href="mailto:brian@oopsconsultancy.com">Brian Agnew</a>
 * @version $Id: Print.java,v 1.2 2006/09/17 16:20:53 bagnew Exp $
 */
public class Print {

  private String path;
  private String buffer;
  private String comment;

  public void setBuffer(final String buffer) {
    this.buffer = buffer;
  }

  public void setPath(final String path) {
    this.path = path;
  }

  public void setComment(final String comment) {
    this.comment = comment;
  }

  public void process(final XmlTask task) {
    if (buffer != null) {
      task.add(new XmlReplace(path, PrintAction.newInstanceFromBuffer(task, buffer, comment)));
    }
    else if (path != null) {
      task.add(new XmlReplace(path, PrintAction.newInstanceFromPath(task, path, comment)));
    }
    else {
      System.err.println("No path or buffer specified for <print> - ignoring");
    }
  }
}

