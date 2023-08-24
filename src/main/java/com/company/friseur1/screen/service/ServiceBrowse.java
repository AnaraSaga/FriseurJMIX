package com.company.friseur1.screen.service;

import io.jmix.ui.screen.*;
import com.company.friseur1.entity.Service;

@UiController("Service.browse")
@UiDescriptor("service-browse.xml")
@LookupComponent("servicesTable")
public class ServiceBrowse extends StandardLookup<Service> {
}