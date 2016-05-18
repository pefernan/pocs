package org.pocs.metawidget.tests.layout.test6;

import javax.swing.JFrame;

import org.metawidget.swing.SwingMetawidget;
import org.metawidget.swing.layout.GridBagLayoutConfig;
import org.metawidget.swing.layout.SeparatorLayoutDecorator;
import org.metawidget.swing.layout.SeparatorLayoutDecoratorConfig;

/**
 * @author Pere Fernandez <pefernan@redhat.com>
 */
public class Main {
    public static void main(String []args) {
        Person person = new Person();

        SwingMetawidget metawidget = new SwingMetawidget();

        GridBagLayoutConfig nestedLayoutConfig = new GridBagLayoutConfig().setNumberOfColumns( 2 );
        SeparatorLayoutDecoratorConfig layoutConfig = new SeparatorLayoutDecoratorConfig().setLayout(
                new org.metawidget.swing.layout.GridBagLayout( nestedLayoutConfig ));
        metawidget.setMetawidgetLayout( new SeparatorLayoutDecorator( layoutConfig ));

        metawidget.setToInspect( person );

        JFrame frame = new JFrame( "Metawidget Tutorial" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( metawidget );
        frame.setSize( 400, 250 );
        frame.setVisible( true );
    }
}
