/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.watcher.support.template;

import org.elasticsearch.common.inject.AbstractModule;

/**
 *
 */
public class TemplateModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MustacheTemplateEngine.class).asEagerSingleton();
        bind(TemplateEngine.class).to(MustacheTemplateEngine.class);
    }
}
