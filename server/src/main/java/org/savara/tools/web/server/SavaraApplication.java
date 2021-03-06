/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008-11, Red Hat Middleware LLC, and others contributors as indicated
 * by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package org.savara.tools.web.server;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Jeff Yu
 * @date: 17/05/11
 */
public class SavaraApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    private Set<Class<?>> claz = new HashSet<Class<?>>();

    public SavaraApplication() {
        singletons.add(new ActivityService());
    }

    @Override
    public Set<Class<?>> getClasses() {
        claz.add(JacksonConfigurator.class);
        return claz;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}
