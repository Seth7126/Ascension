// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroOrConstruct30SelectAcquireFromKingdomToHandER13CStateMachineP6CStateiPj
// 地址: 0x121ea8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t result = *(arg2 + 0x264)

if (result s>= 1)
    ascension::CCardStackUniformAscension* r1 = *(arg3 + 0x14)
    void* __offset(CState, 0x2a8) r7_1 = arg2 + 0x2a8
    ascension::CActiveEffectInstance* r8_1 = *(*(arg2 + 0x24c) + 4)
    int32_t r2_1 = 0
    
    do
        if (r1 == *(r7_1 - 0x40))
            if (zx.d(*(arg2 + 0x252)) == 0)
                void* r0_1 = *r7_1
                
                if (r0_1 == 0xffffffff)
                    r0_1 = memchr(r7_1 - 0x20, 1, *(r7_1 - 0x24)) - (r7_1 - 0x20)
                
                r1 = zx.d(*(r7_1 + (r0_1 << 1) - 0x10))
                
                if (r1 != 0)
                    core::CWorldBase::GetInstanceByID(r8_1)
                    r1 = ascension::CWorld::PlayActiveEffect(r8_1)
            
            return ascensionrules::CStateProcessAcquireHeroOrConstruct::AcquireFromKingdom(arg2, 
                r1, arg3) __tailcall
        
        r2_1 += 1
        r7_1 += 0x44
    while (r2_1 s< result)

return result
