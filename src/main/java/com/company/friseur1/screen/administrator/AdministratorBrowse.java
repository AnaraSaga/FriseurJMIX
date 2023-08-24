package com.company.friseur1.screen.administrator;

import io.jmix.ui.screen.*;
import com.company.friseur1.entity.Administrator;

@UiController("Administrator.browse")
@UiDescriptor("administrator-browse.xml")
@LookupComponent("administratorsTable")
public class AdministratorBrowse extends StandardLookup<Administrator> {
}