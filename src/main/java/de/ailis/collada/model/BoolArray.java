/*
 * Copyright (C) 2010 Klaus Reimer <k@ailis.de>
 * See LICENSE.txt for licensing information.
 */

package de.ailis.collada.model;


/**
 * Array with boolean elements.
 *
 * @author Klaus Reimer (k@ailis.de)
 */

public final class BoolArray extends Array
{
    /** Serial version UID. */
    private static final long serialVersionUID = 1L;

    /** The data. */
    private boolean[] data;


    /**
     * Constructor.
     *
     * @param count
     *            The data size.
     */

    public BoolArray(final int count)
    {
        if (count < 0)
            throw new IllegalArgumentException("count must be >= 0");
        this.data = new boolean[count];
    }


    /**
     * @see de.ailis.collada.model.Array#getCount()
     */

    @Override
    public int getCount()
    {
        return this.data.length;
    }


    /**
     * @see de.ailis.collada.model.Array#setCount(int)
     */

    @Override
    public void setCount(final int count)
    {
        final boolean[] oldData = this.data;
        this.data = new boolean[count];
        System.arraycopy(oldData, 0, this.data, 0, Math
                .min(count, oldData.length));
    }


    /**
     * @see de.ailis.collada.model.Array#getData()
     */

    @Override
    public boolean[] getData()
    {
        return this.data;
    }
}
