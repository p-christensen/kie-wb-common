/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.stunner.core.client.canvas.controls.builder.request;

import org.kie.workbench.common.stunner.core.graph.Edge;
import org.kie.workbench.common.stunner.core.graph.Node;
import org.kie.workbench.common.stunner.core.graph.content.view.View;

public final class NodeBuildRequestImpl extends AbstractBuildRequest implements NodeBuildRequest {

    private final Node<View<?>, Edge> node;
    private Edge<View<?>, Node> inEdge;
    private final int sourceMagnet;
    private final int targetMagnet;

    public NodeBuildRequestImpl( final double x,
                                 final double y,
                                 final Node<View<?>, Edge> node ) {
        super( x, y );
        this.node = node;
        this.sourceMagnet = 0;
        this.targetMagnet = 0;
    }

    public NodeBuildRequestImpl( final double x,
                                 final double y,
                                 final Node<View<?>, Edge> node,
                                 final Edge<View<?>, Node> inEdge ) {
        super( x, y );
        this.node = node;
        this.inEdge = inEdge;
        this.sourceMagnet = 0;
        this.targetMagnet = 0;
    }

    public NodeBuildRequestImpl( final double x,
                                 final double y,
                                 final Node<View<?>, Edge> node,
                                 final Edge<View<?>, Node> inEdge,
                                 final int sourceMagnet,
                                 final int targetMagnet ) {
        super( x, y );
        this.node = node;
        this.inEdge = inEdge;
        this.targetMagnet = targetMagnet;
        this.sourceMagnet = sourceMagnet;
    }

    @Override
    public Node<View<?>, Edge> getNode() {
        return node;
    }

    @Override
    public Edge<View<?>, Node> getInEdge() {
        return inEdge;
    }

    @Override
    public int getSourceManger() {
        return sourceMagnet;
    }

    @Override
    public int getTargetMagnet() {
        return targetMagnet;
    }

}
