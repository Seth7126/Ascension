// 函数: _ZNK9ascension7CPlayer14FindCardInPlayEPN4core13CCardInstanceE
// 地址: 0xee420
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* lr = *(arg1 + 0x48)
int32_t r12 = *(arg1 + 0x4c)
int32_t entry_r1
void* result

if (lr != r12)
    do
        result = *lr
        lr = &lr[1]
        
        if (*(result + 0x10) == entry_r1)
            return result
    while (r12 != lr)

void** r3_2 = *(arg1 + 0x60)
int32_t r12_1 = *(arg1 + 0x64)

if (r3_2 == r12_1)
    return 0

while (true)
    result = *r3_2
    r3_2 = &r3_2[1]
    
    if (*(result + 0x10) == entry_r1)
        return result
    
    if (r12_1 == r3_2)
        return 0
