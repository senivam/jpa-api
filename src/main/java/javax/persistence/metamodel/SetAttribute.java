/*
 * Copyright (c) 2008, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Linda DeMichiel - Java Persistence 2.1
//     Linda DeMichiel - Java Persistence 2.0

package javax.persistence.metamodel;

/**
 * Instances of the type <code>SetAttribute</code> represent
 * persistent <code>java.util.Set</code>-valued attributes.
 *
 * @param <X> The type the represented Set belongs to
 * @param <E> The element type of the represented Set
 *
 * @since Java Persistence 2.0
 */
public interface SetAttribute<X, E> 
	extends PluralAttribute<X, java.util.Set<E>, E> {} 
