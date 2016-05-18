package org.pocs.metawidget.tests.inspectors.test3;

import javax.swing.JFrame;

import org.metawidget.inspector.xml.XmlInspector;
import org.metawidget.inspector.xml.XmlInspectorConfig;
import org.metawidget.swing.SwingMetawidget;

/**
 * @author Pere Fernandez <pefernan@redhat.com>
 */
public class Main {
    public static void main(String []args) {
        Person person = new Person();

        SwingMetawidget metawidget = new SwingMetawidget();

        XmlInspectorConfig config = new XmlInspectorConfig();
        config.setInputStream( Main.class.getResourceAsStream( "metawidget-metadata.xml" ));
        metawidget.setInspector( new XmlInspector( config ) );

        metawidget.setToInspect( person );

        JFrame frame = new JFrame( "Metawidget Tutorial" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( metawidget );
        frame.setSize( 400, 250 );
        frame.setVisible( true );
    }
}
