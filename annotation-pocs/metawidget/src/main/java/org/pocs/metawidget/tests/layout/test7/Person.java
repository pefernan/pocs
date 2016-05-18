package org.pocs.metawidget.tests.layout.test7;

import org.metawidget.inspector.annotation.UiComesAfter;
import org.metawidget.inspector.annotation.UiLarge;
import org.metawidget.inspector.annotation.UiSection;

/**
 * @author Pere Fernandez <pefernan@redhat.com>
 */
public class Person {
    public enum Gender { Male, Female }

    private String	mName;
    private int		mAge;
    private boolean	mRetired;

    private Gender	mGender;
    private String	mNotes;
    private String	mEmployer;
    private String	mDepartment;

    public String getName() { return mName; }
    public void setName( String name ) { mName = name; }

    @UiComesAfter( "name" )
    public int getAge() { return mAge; }
    public void setAge( int age ) { mAge = age; }

    @UiComesAfter( "age" )
    public boolean isRetired() { return mRetired; }
    public void setRetired( boolean retired ) { mRetired = retired; }

    @UiComesAfter( "retired" )
    public Gender getGender() { return mGender; }
    public void setGender( Gender gender ) { mGender = gender; }

    @UiComesAfter( "gender" )
    @UiLarge
    public String getNotes() { return mNotes; }
    public void setNotes( String notes ) { mNotes = notes; }

    @UiComesAfter( "notes" )
    @UiSection( "Work" )
    public String getEmployer() { return mEmployer; }
    public void setEmployer( String employer ) { mEmployer = employer; }

    @UiComesAfter( "employer" )
    public String getDepartment() { return mDepartment; }
    public void setDepartment( String department ) { mDepartment = department; }
}
