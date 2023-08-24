package com.company.friseur1.screen.administrator;

import io.jmix.ui.screen.*;
import com.company.friseur1.entity.Administrator;

@UiController("Administrator.edit")
@UiDescriptor("administrator-edit.xml")
@EditedEntityContainer("administratorDc")
public class AdministratorEdit extends StandardEditor<Administrator> {
}