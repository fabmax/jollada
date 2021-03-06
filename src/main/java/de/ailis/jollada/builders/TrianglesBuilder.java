/*
 * Copyright (C) 2010 Klaus Reimer <k@ailis.de>
 * See LICENSE.txt for licensing information.
 */

package de.ailis.jollada.builders;

import de.ailis.jollada.model.IntList;
import de.ailis.jollada.model.Triangles;


/**
 * Builder for triangles primitives.
 *
 * @author Klaus Reimer (k@ailis.de)
 */

public final class TrianglesBuilder extends PrimitivesBuilder
{
    /** The geometric element. */
    private IntList data;


    /**
     * Builds the triangles.
     *
     * @return The triangles. Never null.
     */

    @Override
    public Triangles build()
    {
        if (this.data == null)
            throw new IllegalStateException("data not set");
        final Triangles triangles = new Triangles(this.count, this.data);
        triangles.setMaterial(this.material);
        triangles.setName(this.name);
        triangles.getInputs().addAll(this.inputs);
        return triangles;
    }


    /**
     * Resets the builder.
     */

    @Override
    public void reset()
    {
        super.reset();
        this.data = null;
        this.material = null;
        this.name = null;
    }


    /**
     * Returns the next primitive data.
     *
     * @return The next primitive data. May be null if unset.
     */

    public IntList getData()
    {
        return this.data;
    }


    /**
     * Sets the next primitive data.
     *
     * @param data
     *            The next primitive data to set. Null to unset.
     */

    public void setData(final IntList data)
    {
        this.data = data;
    }
}
