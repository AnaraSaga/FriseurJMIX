package com.company.friseur1.screen.master;

import io.jmix.ui.screen.*;
import com.company.friseur1.entity.Master;

@UiController("Master.browse")
@UiDescriptor("master-browse.xml")
@LookupComponent("mastersTable")
public class MasterBrowse extends StandardLookup<Master> {
}