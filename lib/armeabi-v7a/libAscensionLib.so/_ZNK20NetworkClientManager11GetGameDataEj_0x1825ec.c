// 函数: _ZNK20NetworkClientManager11GetGameDataEj
// 地址: 0x1825ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* lr = *(arg1 + 0xdc)
int32_t r12 = *(arg1 + 0xe0)
int32_t entry_r1
void* result

if (lr != r12)
    do
        result = *lr
        lr = &lr[1]
        
        if (*(result + 4) == entry_r1)
            if (result != 0)
                return result
            
            break
    while (r12 != lr)

void** r3_2 = *(arg1 + 0xe8)
int32_t r12_1 = *(arg1 + 0xec)

if (r3_2 == r12_1)
    return 0

while (true)
    result = *r3_2
    r3_2 = &r3_2[1]
    
    if (*(result + 4) == entry_r1)
        return result
    
    if (r12_1 == r3_2)
        return 0
