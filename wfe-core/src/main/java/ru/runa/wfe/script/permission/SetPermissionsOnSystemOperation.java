package ru.runa.wfe.script.permission;

import javax.xml.bind.annotation.XmlType;

import ru.runa.wfe.script.AdminScriptConstants;
import ru.runa.wfe.security.ASystem;

@XmlType(name = SetPermissionsOnSystemOperation.SCRIPT_NAME + "Type", namespace = AdminScriptConstants.NAMESPACE)
public class SetPermissionsOnSystemOperation extends ChangePermissionsOnIdentifiableOperation {

    public static final String SCRIPT_NAME = "setPermissionsOnSystem";

    public SetPermissionsOnSystemOperation() {
        super(ASystem.INSTANCE, ChangePermissionType.SET);
    }
}
