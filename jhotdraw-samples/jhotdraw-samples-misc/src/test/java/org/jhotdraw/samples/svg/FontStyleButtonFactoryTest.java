package org.jhotdraw.samples.svg;

import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.gui.action.FontStyleButtonFactory;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;
import java.util.Set;

import static org.jhotdraw.draw.AttributeKeys.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class FontStyleButtonFactoryTest {

    @Test
    void fontStyleButtonAction() {
        var parameters = Map.ofEntries(
                Map.entry(FontStyleButtonFactory.FontStyle.BOLD, FONT_BOLD),
                Map.entry(FontStyleButtonFactory.FontStyle.ITALIC, FONT_ITALIC),
                Map.entry(FontStyleButtonFactory.FontStyle.UNDERLINE, FONT_UNDERLINE),
                Map.entry(FontStyleButtonFactory.FontStyle.STRIKETHROUGH, FONT_STRIKETHROUGH)
                );

        for (var entry: parameters.entrySet()) {
            // Mock everything
            var editor = Mockito.mock(DefaultDrawingEditor.class);
            var view = Mockito.mock(DefaultDrawingView.class);
            var drawing = Mockito.mock(DefaultDrawing.class);
            var figure = Mockito.mock(Figure.class);

            // Create a button
            var button = FontStyleButtonFactory.createFontStyleButton(editor, entry.getKey());

            // Inject mocks in all getters
            when(editor.getActiveView()).thenReturn(view);
            when(view.getDrawing()).thenReturn(drawing);
            when(view.getSelectedFigures()).thenReturn(Set.of(figure));

            // Press the button
            button.doClick();

            // Assert that the attribute key was retrieved by the attribute toggle
            verify(figure, times(1)).get(entry.getValue());
        }
    }

    @Test
    void fontStyleButtonLabel() {
        var labels = Map.ofEntries(
                Map.entry(FontStyleButtonFactory.FontStyle.BOLD, "Bold"),
                Map.entry(FontStyleButtonFactory.FontStyle.ITALIC, "Italic"),
                Map.entry(FontStyleButtonFactory.FontStyle.UNDERLINE, "Underline"),
                Map.entry(FontStyleButtonFactory.FontStyle.STRIKETHROUGH, "Strikethrough")
        );

        for (var entry: labels.entrySet()) {
            var editor = new DefaultDrawingEditor();
            var button = FontStyleButtonFactory.createFontStyleButton(editor, entry.getKey());
            assertEquals(entry.getValue(), button.getText());
        }
    }
}