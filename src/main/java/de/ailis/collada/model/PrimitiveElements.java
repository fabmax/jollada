/*
 * Copyright (C) 2010 Klaus Reimer <k@ailis.de>
 * See LICENSE.txt for licensing information.
 */

package de.ailis.collada.model;


/**
 * List of primitives.
 *
 * @author Klaus Reimer (k@ailis.de)
 */

public final class PrimitiveElements extends Elements<Primitives>
{
    /** Serial version UID. */
    private static final long serialVersionUID = 1L;


    /**
     * Constructor.
     *
     * @param parent
     *            The parent element. Must not be null.
     */

    PrimitiveElements(final Element parent)
    {
        super(parent);
    }
}
