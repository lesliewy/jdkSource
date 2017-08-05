/*
 * %Z%file      %M%
 * %Z%author    Sun Microsystems, Inc.
 * %Z%version   %I%
 * %Z%date      %D%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/* Generated By:JJTree: Do not edit this line. JDMInformBlock.java */

package com.sun.jmx.snmp.IPAcl;

import java.util.Hashtable;

class JDMInformBlock extends SimpleNode {
    JDMInformBlock(int id) {
        super(id);
    }

    JDMInformBlock(Parser p, int id) {
        super(p, id);
    }

    public static Node jjtCreate(int id) {
        return new JDMInformBlock(id);
    }

    public static Node jjtCreate(Parser p, int id) {
        return new JDMInformBlock(p, id);
    }

    /**
     * Do no need to go through this part of the tree for
     * building AclEntry.
     */
    public void buildAclEntries(PrincipalImpl owner, AclImpl acl) {}

    /**
     * Do no need to go through this part of the tree for
     * building TrapEntry.
     */
    public void buildTrapEntries(Hashtable dest) {}
}
