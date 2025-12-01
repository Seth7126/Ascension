// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroToTopOfDeck35SelectAcquireFromKingdomToTopOfDeckER13CStateMachineP6CStateiPj
// 地址: 0x11fe28
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
core::CCardInstance* r8 = *(arg2 + 0x24c)
ascension::CActiveEffectInstance* r9 = *(r8 + 4)
uint32_t r0_1
uint32_t r3
r0_1, r3 = ascension::CCardStackUniformAscension::TakeSampleCardInstance()
int32_t result = *(arg2 + 0x26c)

if (result s>= 1)
    void* __offset(CState, 0x2b0) r5_1 = arg2 + 0x2b0
    int32_t r1 = 0
    
    do
        if (r0_1 == *(r5_1 - 0x40))
            void* r0_2 = *r5_1
            
            if (r0_2 == 0xffffffff)
                void* r0_4
                r0_4, r3 = memchr(r5_1 - 0x20, 2, *(r5_1 - 0x24))
                r0_2 = r0_4 - (r5_1 - 0x20)
            
            if (zx.d(*(r5_1 + (r0_2 << 1) - 0x10)) != 0)
                core::CWorldBase::GetInstanceByID(r9)
                r3 = ascension::CWorld::PlayActiveEffect(r9)
            
            if (*(arg3 + 0x10) s>= 1)
                r3 = core::CCardStackUniform::SetCardCount(arg3)
            
            void* r0_11 = *(arg3 + 0x14)
            
            if (r0_11 != 0)
                r3 = zx.d(*(r0_11 + 8))
            
            int32_t var_30 = *(arg3 + 0x10)
            
            if (r0_11 == 0)
                r3 = 0
            
            ascension::CWorld::OutputEvent(r9, 0x21, zx.d(*(arg3 + 8)), r3)
            
            if (*(arg2 + 0x268) != 0)
                ascension::CWorld::PlayActiveEffect(r9)
            
            int32_t* r0_15 = *(arg2 + 0x264)
            
            if (r0_15 != 0)
                void* r2_4 = r0_15 + *r0_15 + 4
                uint32_t r1_6 = zx.d(*r2_4)
                
                if (r1_6 u<= 7)
                    uint32_t r3_1 = zx.d(*(r0_1 + 8))
                    *r2_4 = r1_6.b + 1
                    r0_15[*r0_15 * 8 + r1_6 + 4] = r3_1
            
            int32_t var_2c = 2
            ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
                operator new(0x990), r8, r0_1, 6, zx.d(*(arg3 + 8)))
            CState::AddOwnedChild(arg2)
            return CStateList::AppendState(arg2) __tailcall
        
        r1 += 1
        r5_1 += 0x44
    while (r1 s< result)

return result
