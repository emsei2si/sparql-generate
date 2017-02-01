/*
 * Copyright 2016 Ecole des Mines de Saint-Etienne.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.thesmartenergy.sparql.generate.jena.syntax;

import org.apache.jena.sparql.core.Var;
import org.apache.jena.sparql.syntax.Element;

/**
 * A SPARQL Generate {@code SOURCE} or {@code ITERATOR} clause.
 * 
 * @author Maxime Lefrançois <maxime.lefrancois at emse.fr>
 */
public abstract class ElementIteratorOrSource extends Element {
    
    private Var var;

    public ElementIteratorOrSource(Var var) {
        this.var = var;
    }

    public Var getVar() {
        return var;
    }
    
}
