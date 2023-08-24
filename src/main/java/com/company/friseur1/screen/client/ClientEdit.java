package com.company.friseur1.screen.client;

import com.company.friseur1.entity.Master;
import io.jmix.ui.component.ComboBox;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.screen.*;
import com.company.friseur1.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
public class ClientEdit extends StandardEditor<Client> {
    @Autowired
    private ComboBox<Master> masterComboBox;
    @Autowired
    private CollectionContainer<Master> mastersDc;

    @Subscribe
    public void onAfterShow(final AfterShowEvent event) {
        masterComboBox.setOptionsList(mastersDc.getItems());
    }
}