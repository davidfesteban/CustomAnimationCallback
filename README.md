# CustomAnimationCallback
An easy example of how to do an animation callback for all those cases where you have to wait until it finishes

Example of usage with Glide:

       Glide.with(this)
            .asGif()
            .load(R.drawable.yourdrawable)
            .addListener(new RequestListener<GifDrawable>() {
                @Override
                public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<GifDrawable> target, boolean isFirstResource) {
                    return false;
            
                @Override
                public boolean onResourceReady(GifDrawable resource, Object model, Target<GifDrawable> target, DataSource dataSource, boolean isFirstResource) {
                    resource.setLoopCount(1);
                    resource.registerAnimationCallback(new CustomAnimationCallback() {
                        @Override
                        public void onStart(Drawable d){}
               
                        @Override
                        public void onEnd(Drawable drawable) {
                            //doStuff
                        }
                    });
                    return false;
                }
            })
            .into(targetImageViewToLoadTheGif);
