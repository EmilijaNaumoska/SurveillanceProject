{"id":"da494a8d-fc72-4835-95a7-1eb0c8fd64fc","name":"SurveillanceProject.DetailedViewConclusionProcess-taskform","model":{"processName":"DetailedViewConclusionProcess","processId":"SurveillanceProject.DetailedViewConclusionProcess","name":"process","properties":[{"name":"inspectionConclusion","typeInfo":{"type":"OBJECT","className":"com.myspace.surveillanceproject.InspectionConclusion","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.process.BusinessProcessFormModel"},"fields":[{"nestedForm":"d6e5a1ce-e7d0-4522-819a-ccc845fced95","container":"FIELD_SET","id":"field_246","name":"inspectionConclusion","label":"InspectionConclusion","required":false,"readOnly":true,"validateOnChange":true,"helpMessage":"","binding":"inspectionConclusion","standaloneClassName":"com.myspace.surveillanceproject.InspectionConclusion","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"options":[],"addEmptyOption":true,"dataProvider":"","id":"field_9805","name":"__unbound_field_field_9805","label":"detailedView.newCheckControl","required":false,"readOnly":true,"validateOnChange":true,"helpMessage":"","standaloneClassName":"java.lang.String","code":"ListBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.selectors.listBox.definition.StringListBoxFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_246","form_id":"da494a8d-fc72-4835-95a7-1eb0c8fd64fc"},"parts":[{"partId":"Legend Text","cssProperties":{}}]}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_9805","form_id":"da494a8d-fc72-4835-95a7-1eb0c8fd64fc"},"parts":[{"partId":"ListBox","cssProperties":{}},{"partId":"Field Label","cssProperties":{}}]}]}]}]}}