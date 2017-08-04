/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package org.omg.PortableServer;


/**
* org/omg/PortableServer/CurrentHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from ../../../../src/share/classes/org/omg/PortableServer/poa.idl
* Tuesday, October 23, 2001 1:17:01 PM PDT
*/


/**
 * The PortableServer::Current interface, derived from
 * CORBA::Current, provides method implementations with
 * access to the identity of the object on which the
 * method was invoked. The Current interface is provided
 * to support servants that implement multiple objects,
 * but can be used within the context of POA-dispatched
 * method invocations on any servant. To provide location
 * transparency, ORBs are required to support use of
 * Current in the context of both locally and remotely
 * invoked operations. An instance of Current can be
 * obtained by the application by issuing the
 * CORBA::ORB::resolve_initial_references("POACurrent")
 * operation. Thereafter, it can be used within the
 * context of a method dispatched by the POA to obtain
 * the POA and ObjectId that identify the object on
 * which that operation was invoked.
 */
abstract public class CurrentHelper
{
    private static String  _id = "IDL:omg.org/PortableServer/Current:2.3";

    public static void insert (org.omg.CORBA.Any a, 
        org.omg.PortableServer.Current that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    public static org.omg.PortableServer.Current extract (org.omg.CORBA.Any a)
    {
        return read (a.create_input_stream ());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    synchronized public static org.omg.CORBA.TypeCode type ()
    {
        if (__typeCode == null)
        {
            __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (
                org.omg.PortableServer.CurrentHelper.id (), "Current");
        }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    public static org.omg.PortableServer.Current read (
        org.omg.CORBA.portable.InputStream istream)
    {
        throw new org.omg.CORBA.MARSHAL ();
    }

    public static void write (org.omg.CORBA.portable.OutputStream ostream, 
        org.omg.PortableServer.Current value)
    {
        throw new org.omg.CORBA.MARSHAL ();
    }

    public static org.omg.PortableServer.Current narrow (
        org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        else if (obj instanceof org.omg.PortableServer.Current)
            return (org.omg.PortableServer.Current)obj;
        else if (!obj._is_a (id ()))
            throw new org.omg.CORBA.BAD_PARAM ();
        return null;
    }

}
