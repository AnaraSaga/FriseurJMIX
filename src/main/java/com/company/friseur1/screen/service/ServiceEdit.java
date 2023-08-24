package com.company.friseur1.screen.service;

import io.jmix.ui.screen.*;
import com.company.friseur1.entity.Service;

@UiController("Service.edit")
@UiDescriptor("service-edit.xml")
@EditedEntityContainer("serviceDc")
public class ServiceEdit extends StandardEditor<Service> {
}