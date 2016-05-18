package org.pocs.metawidget.tests.basic.test2;

import org.metawidget.inspector.annotation.UiComesAfter;

/**
 * @author Pere Fernandez <pefernan@redhat.com>
 */
public class Person {
    private String	mName;

    private int		mAge;

    private boolean	mRetired;

    public String getName() { return mName; }
    public void setName( String name ) { mName = name; }

    @UiComesAfter( "name" )
    public int getAge() { return mAge; }
    public void setAge( int age ) { mAge = age; }

    @UiComesAfter( "age" )
    public boolean isRetired() { return mRetired; }
    public void setRetired( boolean retired ) { mRetired = retired; }
}
