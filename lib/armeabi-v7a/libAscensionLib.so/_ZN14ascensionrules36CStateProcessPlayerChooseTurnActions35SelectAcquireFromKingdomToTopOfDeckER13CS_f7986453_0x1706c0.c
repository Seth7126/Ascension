// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions35SelectAcquireFromKingdomToTopOfDeckER13CStateMachineP6CStateiPj
// 地址: 0x1706c0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CActiveEffectInstance* r9 = *(*(arg2 + 0x24c) + 4)
uint32_t r0_2 = core::CWorldBase::GetInstanceByID(r9)
int32_t result = *(arg2 + 0x254)

if (result s>= 1)
    void* __offset(CState, 0x298) r7_1 = arg2 + 0x298
    int32_t r5_1 = 0
    
    do
        if (*(r0_2 + 0x14) == *(r7_1 - 0x40))
            void* r0_3 = *r7_1
            
            if (r0_3 == 0xffffffff)
                r0_3 = memchr(r7_1 - 0x20, 2, *(r7_1 - 0x24)) - (r7_1 - 0x20)
            
            ascension::CCardStackUniformAscension* r1_2 = zx.d(*(r7_1 + (r0_3 << 1) - 0x10))
            
            if (r1_2 != 0)
                core::CWorldBase::GetInstanceByID(r9)
                r1_2 = ascension::CWorld::PlayActiveEffect(r9)
            
            int32_t var_28 = r5_1
            return ascensionrules::CStateProcessPlayerChooseTurnActions::AcquireFromKingdom(arg2, 
                r1_2, r0_2, 2)
        
        r5_1 += 1
        r7_1 += 0x44
    while (r5_1 s< result)

return result
