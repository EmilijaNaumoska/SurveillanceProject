{"id":"f6a75fae-bc27-41e4-8a48-6b0f57e1f01e","name":"CommonForm","model":{"source":"INTERNAL","className":"com.myspace.surveillanceproject.CommonInspectionObject","name":"CommonInspectionObject","properties":[{"name":"subjectSubsidiary","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"subjectSubsidiary"},{"name":"field-placeHolder","value":"subjectSubsidiary"}]}},{"name":"createdAt","typeInfo":{"type":"BASE","className":"java.util.Date","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"createdAt"},{"name":"field-placeHolder","value":"createdAt"}]}},{"name":"institution","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"institution"},{"name":"field-placeHolder","value":"institution"}]}},{"name":"processInstanceId","typeInfo":{"type":"BASE","className":"java.lang.Long","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"processInstanceId"},{"name":"field-placeHolder","value":"processInstanceId"}]}},{"name":"createdBy","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"createdBy"},{"name":"field-placeHolder","value":"createdBy"}]}},{"name":"subject","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"subject"},{"name":"field-placeHolder","value":"subject"}]}},{"name":"sector","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"sector"},{"name":"field-placeHolder","value":"sector"}]}},{"name":"assignedTo","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-label","value":"assignedTo"},{"name":"field-placeHolder","value":"assignedTo"}]}}],"formModelType":"org.kie.workbench.common.forms.data.modeller.model.DataObjectFormModel"},"fields":[{"options":[],"addEmptyOption":true,"dataProvider":"","id":"field_38904","name":"subject","label":"subject","required":false,"readOnly":true,"validateOnChange":true,"helpMessage":"1","binding":"subject","standaloneClassName":"java.lang.String","code":"ListBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.listBox.definition.StringListBoxFieldDefinition"},{"options":[],"addEmptyOption":true,"dataProvider":"","id":"field_0042","name":"subjectSubsidiary","label":"subjectSubsidiary","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"2","binding":"subjectSubsidiary","standaloneClassName":"java.lang.String","code":"ListBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.listBox.definition.StringListBoxFieldDefinition"},{"placeHolder":"createdAt","showTime":true,"id":"field_0892","name":"createdAt","label":"anchor.createdAt","required":false,"readOnly":true,"validateOnChange":true,"helpMessage":"3","binding":"createdAt","standaloneClassName":"java.util.Date","code":"DatePicker","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.datePicker.definition.DatePickerFieldDefinition"},{"options":[],"addEmptyOption":true,"dataProvider":"","id":"field_544","name":"institution","label":"institution","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"4","binding":"institution","standaloneClassName":"java.lang.String","code":"ListBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.listBox.definition.StringListBoxFieldDefinition"},{"options":[],"addEmptyOption":true,"dataProvider":"","id":"field_3567","name":"sector","label":"sector","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"5","binding":"sector","standaloneClassName":"java.lang.String","code":"ListBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.listBox.definition.StringListBoxFieldDefinition"},{"options":[],"addEmptyOption":true,"dataProvider":"","id":"field_6434","name":"assignedTo","label":"assignedTo","required":false,"readOnly":false,"validateOnChange":true,"helpMessage":"6","binding":"assignedTo","standaloneClassName":"java.lang.String","code":"ListBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.listBox.definition.StringListBoxFieldDefinition"},{"options":[],"addEmptyOption":true,"dataProvider":"","id":"field_7483","name":"createdBy","label":"createdBy","required":false,"readOnly":true,"validateOnChange":true,"helpMessage":"","binding":"createdBy","standaloneClassName":"java.lang.String","code":"ListBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.listBox.definition.StringListBoxFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"3","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_544","form_id":"f6a75fae-bc27-41e4-8a48-6b0f57e1f01e"},"parts":[{"partId":"Field Label","cssProperties":{}},{"partId":"ListBox","cssProperties":{}}]}]},{"span":"12","height":"3","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_7483","form_id":"f6a75fae-bc27-41e4-8a48-6b0f57e1f01e"},"parts":[{"partId":"Field Label","cssProperties":{}},{"partId":"ListBox","cssProperties":{}}]}]},{"span":"12","height":"3","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_3567","form_id":"f6a75fae-bc27-41e4-8a48-6b0f57e1f01e"},"parts":[{"partId":"Field Label","cssProperties":{}},{"partId":"ListBox","cssProperties":{}}]}]},{"span":"12","height":"3","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_6434","form_id":"f6a75fae-bc27-41e4-8a48-6b0f57e1f01e"},"parts":[{"partId":"Field Label","cssProperties":{}},{"partId":"ListBox","cssProperties":{}}]}]}]}],"layoutComponents":[]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"2","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_38904","form_id":"f6a75fae-bc27-41e4-8a48-6b0f57e1f01e"},"parts":[{"partId":"Field Label","cssProperties":{}},{"partId":"ListBox","cssProperties":{}}]}]},{"span":"12","height":"2","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_0042","form_id":"f6a75fae-bc27-41e4-8a48-6b0f57e1f01e"},"parts":[{"partId":"Field Label","cssProperties":{}},{"partId":"ListBox","cssProperties":{}}]}]},{"span":"12","height":"8","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_0892","form_id":"f6a75fae-bc27-41e4-8a48-6b0f57e1f01e"},"parts":[{"partId":"Field Label","cssProperties":{}}]}]}]}],"layoutComponents":[]}]}]}}