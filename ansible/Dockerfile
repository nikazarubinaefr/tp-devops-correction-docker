FROM alpine:3.19

# Install Ansible and SSH client
RUN apk add --no-cache \
    ansible \
    openssh-client \
    python3 \
    py3-pip

# Create working directory
WORKDIR /ansible

# Copy Ansible configuration
COPY . /ansible/

# Set default command
ENTRYPOINT ["ansible-playbook"]
CMD ["--help"]
