/*
 * Copyright (c) 2011, 2018 Oracle and/or its affiliates. All rights reserved.
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

package javax.persistence;

/**
 * Specifies whether the persistence context is always automatically 
 * synchronized with the current transaction or whether the persistence context
 * must be explicitly joined to the current transaction by means of the
 * {@link EntityManager#joinTransaction} method.
 *
 * @since Java Persistence 2.1
 */
public enum SynchronizationType {

    /** Persistence context is automatically synchronized with the current transaction */
    SYNCHRONIZED,

    /** Persistence context must be explicitly joined to the current transaction */
    UNSYNCHRONIZED,
}
