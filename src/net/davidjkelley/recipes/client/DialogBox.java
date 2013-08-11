package net.davidjkelley.recipes.client;

import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Event.NativePreviewEvent;

/**
 * Stores information about an event
 * @param useEscape Whether the DialogBox will allow Escape key to close the dialog.
 *
 */

public class DialogBox extends com.google.gwt.user.client.ui.DialogBox {
	public boolean useEscape;

	public DialogBox(Boolean useEscape) {
		super();
		this.useEscape = useEscape;
	}
	@Override
	protected void onPreviewNativeEvent(NativePreviewEvent event) {
		super.onPreviewNativeEvent(event);
		switch (event.getTypeInt()) {
		case Event.ONKEYDOWN:
			if (event.getNativeEvent().getKeyCode() == KeyCodes.KEY_ESCAPE) {
				if (useEscape) {
				hide();
				}
			}
			break;
		}
	}
}
