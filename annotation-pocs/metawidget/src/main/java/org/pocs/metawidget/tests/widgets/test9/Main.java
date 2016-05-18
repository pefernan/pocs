package org.pocs.metawidget.tests.widgets.test9;

import javax.swing.JFrame;

import org.metawidget.swing.Stub;
import org.metawidget.swing.SwingMetawidget;
import org.metawidget.swing.layout.GridBagLayoutConfig;
import org.metawidget.swing.layout.TabbedPaneLayoutDecorator;
import org.metawidget.swing.layout.TabbedPaneLayoutDecoratorConfig;

/**
 * @author Pere Fernandez <pefernan@redhat.com>
 */
public class Main {
    public static void main(String []args) {
        Person person = new Person();

        SwingMetawidget metawidget = new SwingMetawidget();

        GridBagLayoutConfig nestedLayoutConfig = new GridBagLayoutConfig().setNumberOfColumns( 2 );

        TabbedPaneLayoutDecoratorConfig layoutConfig = new TabbedPaneLayoutDecoratorConfig().setLayout(
                new org.metawidget.swing.layout.GridBagLayout( nestedLayoutConfig ));
        metawidget.setMetawidgetLayout( new TabbedPaneLayoutDecorator( layoutConfig ));

        metawidget.setToInspect( person );

        metawidget.add( new Stub( "retired" ) );

        JFrame frame = new JFrame( "Metawidget Tutorial" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( metawidget );
        frame.setSize( 400, 250 );
        frame.setVisible( true );
    }
}
