// 函数: _ZNK20NetworkClientManager23GetLastChatMessageIndexEj
// 地址: 0x1859b4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r3 = *(arg1 + 0xdc)
int32_t r12 = *(arg1 + 0xe0)
void* lr_1
int32_t entry_r1

if (r3 == r12)
label_1859f0:
    void** r3_1 = *(arg1 + 0xe8)
    int32_t r12_1 = *(arg1 + 0xec)
    
    if (r3_1 == r12_1)
        return 0
    
    while (true)
        lr_1 = *r3_1
        r3_1 = &r3_1[1]
        
        if (*(lr_1 + 4) == entry_r1)
            break
        
        if (r12_1 == r3_1)
            return 0
    
    if (lr_1 == 0)
        return 0
else
    while (true)
        lr_1 = *r3
        r3 = &r3[1]
        
        if (*(lr_1 + 4) == entry_r1)
            break
        
        if (r12 == r3)
            goto label_1859f0
    
    if (lr_1 == 0)
        goto label_1859f0
void* r0_1 = *(lr_1 + 0xa28)

if (r0_1 == 0)
    return 0

return *(r0_1 + 0xc)
