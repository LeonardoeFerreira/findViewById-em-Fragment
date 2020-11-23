 @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View fragmentView = inflater.inflate(R.layout.testclassfragment, container, false);
            ImageView imageView = (ImageView)fragmentView.findViewById(R.id.my_image);
            return fragmentView;
       }
