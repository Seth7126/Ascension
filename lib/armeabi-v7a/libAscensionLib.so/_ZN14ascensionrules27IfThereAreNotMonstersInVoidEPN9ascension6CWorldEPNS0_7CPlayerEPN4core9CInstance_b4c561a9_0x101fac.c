// 函数: _ZN14ascensionrules27IfThereAreNotMonstersInVoidEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x101fac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = *(arg1 + 0xa4c)
int32_t lr = 0
int32_t* r1 = *(r0 + 0xc)
int32_t r12 = *(r0 + 0x10)

if (r1 != r12)
    lr = 0
    
    do
        void* r2 = *r1
        
        if (r2 != 0 && *(*(r2 + 0xc) + 0x88) == 3)
            lr += 1
        
        r1 = &r1[1]
    while (r12 != r1)

if (lr u< arg4)
    return 1

return 0
