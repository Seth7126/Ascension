// 函数: _ZN14ascensionrules23CStateAuctionForInsight10EnterStateER13CStateMachine
// 地址: 0x142378
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

__aeabi_memclr4(arg1 + 0x274, 0x30)
void* r0_1 = *(arg1 + 0x24c)
int32_t i = 0
void* r1 = *(arg1 + 0x250)
*(arg1 + 0x26c) = r1
*(arg1 + 0x270) = *(r0_1 + 0xc)
uint32_t r6 = *(r0_1 + 4)
int32_t var_28 = 0
ascension::CWorld::OutputEvent(r6, 0x3e, zx.d(*(r0_1 + 8)), zx.d(*(r1 + 8)))
*(arg1 + 0x254) = 0xffffffff
*(arg1 + 0x258) = 0
*(arg1 + 0x25c) = 0
*(arg1 + 0x260) = 0
*(arg1 + 0x264) = 0xffffffff
int32_t r0_4 = *(r6 + 0x1c) - *(r6 + 0x18)

if (r0_4 s>= 1)
    do
        void* r0_6 = ascension::CWorld::GetPlayerByTurnOrder(r6, *(arg1 + 0x24c))
        *(arg1 + 0x274 + (i << 2)) = *(r0_6 + 0xc)
        
        if (*(r0_6 + 0x8c) s>= 1)
            int32_t r1_4 = *(arg1 + 0x60)
            int32_t r2_4 = *(arg1 + 0x64)
            *(arg1 + 0x25c) += 1
            *(arg1 + 0x260) = r1_4 | 1 << (i & 0xff)
            
            if (r2_4 == 0xffffffff)
                *(arg1 + 0x264) = i
        
        i += 1
    while (i s< r0_4 s>> 2)

*(arg1 + 0x268) = 0x100
return 0x268
