// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow35SelectAcquireFromKingdomToTopOfDeckER13CStateMachineP6CStateiPj
// 地址: 0x1294d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = *(arg2 + 0x25c)

if (result s>= 1)
    void* __offset(CState, 0x2a0) r7_1 = arg2 + 0x2a0
    ascension::CActiveEffectInstance* r8_1 = *(*(arg2 + 0x24c) + 4)
    int32_t r2_1 = 0
    
    do
        if (*(arg3 + 0x14) == *(r7_1 - 0x40))
            void* r0 = *r7_1
            
            if (r0 == 0xffffffff)
                r0 = memchr(r7_1 - 0x20, 2, *(r7_1 - 0x24)) - (r7_1 - 0x20)
            
            ascension::CCardStackUniformAscension* r1_1 = zx.d(*(r7_1 + (r0 << 1) - 0x10))
            
            if (r1_1 != 0)
                core::CWorldBase::GetInstanceByID(r8_1)
                r1_1 = ascension::CWorld::PlayActiveEffect(r8_1)
            
            return ascensionrules::CStateProcessAcquireOrDefeatAnyCenterRow::AcquireFromKingdom(
                arg2, r1_1, arg3) __tailcall
        
        r2_1 += 1
        r7_1 += 0x44
    while (r2_1 s< result)

return result
