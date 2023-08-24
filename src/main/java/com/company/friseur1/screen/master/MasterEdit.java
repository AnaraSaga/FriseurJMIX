package com.company.friseur1.screen.master;

import com.company.friseur1.entity.Client;
import io.jmix.ui.component.ComboBox;
import io.jmix.ui.component.TagPicker;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.screen.*;
import com.company.friseur1.entity.Master;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Master.edit")
@UiDescriptor("master-edit.xml")

@EditedEntityContainer("masterDc")
public class MasterEdit extends StandardEditor<Master> {
//    @Autowired
//    private TagPicker<Client> clientTagPicker;
//    @Autowired
//    private CollectionContainer<Client> clientDc;

 /*   @Subscribe
    public void onInit(final InitEvent event) {
        clientTagPicker.setOptionCaptionProvider(o -> {
            return o.getFirst_name() + " " + o.getLast_name();
        });
    }*/


    /*@Subscribe
    public void onAfterShow(final AfterShowEvent event) {
        clientTagPicker.setOptionsList(clientDc.getItems());
    }*/

}