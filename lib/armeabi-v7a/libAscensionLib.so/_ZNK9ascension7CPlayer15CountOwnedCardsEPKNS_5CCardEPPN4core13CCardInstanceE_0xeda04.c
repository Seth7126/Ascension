// 函数: _ZNK9ascension7CPlayer15CountOwnedCardsEPKNS_5CCardEPPN4core13CCardInstanceE
// 地址: 0xeda04
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0x84)
int32_t* r3 = *(r0 + 0xc)
int32_t lr = *(r0 + 0x10)
int32_t result
void* const r12

if (r3 == lr)
    r12 = nullptr
    result = 0
else
    result = 0
    r12 = nullptr
    
    do
        void* r4_1 = *r3
        
        if (*(r4_1 + 0xc) == arg2)
            result += 1
            
            if (r12 == 0)
                r12 = r4_1
        
        r3 = &r3[1]
    while (lr != r3)

void** entry_r2

if (entry_r2 != 0)
    *entry_r2 = r12

return result
