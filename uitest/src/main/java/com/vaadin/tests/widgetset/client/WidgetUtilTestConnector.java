/*
 * Copyright 2000-2020 Vaadin Ltd.
 *
 * Licensed under the Commercial Vaadin Developer License version 4.0 (CVDLv4); 
 * you may not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 * https://vaadin.com/license/cvdl-4.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.tests.widgetset.client;

import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.ui.Connect;
import com.vaadin.tests.widgetset.server.WidgetUtilUI.WidgetUtilTestComponent;

@Connect(WidgetUtilTestComponent.class)
public class WidgetUtilTestConnector extends AbstractComponentConnector {

    @Override
    public void onStateChanged(StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);
        getWidget().construct(getState().inline);

    }

    @Override
    public WidgetUtilTestWidget getWidget() {
        return (WidgetUtilTestWidget) super.getWidget();
    }

    @Override
    public WidgetUtilTestComponentState getState() {
        return (WidgetUtilTestComponentState) super.getState();
    }

}
