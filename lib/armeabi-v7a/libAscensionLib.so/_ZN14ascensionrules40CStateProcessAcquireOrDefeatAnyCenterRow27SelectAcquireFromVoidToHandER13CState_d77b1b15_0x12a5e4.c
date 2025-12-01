// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow27SelectAcquireFromVoidToHandER13CStateMachineP6CStateiPj
// 地址: 0x12a5e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

arg1 = *(arg2 + 0xcdc)

if (arg1 s< 1)
    return 

core::CCardInstance* r7_1 = *(arg2 + 0x24c)
int32_t* r5_1 = *(arg2 + 0xce0)
int32_t r1 = 0
ascension::CActiveEffectInstance* r8_1 = *(r7_1 + 4)

do
    if (*r5_1 == arg3)
        void* r0 = r5_1[0x10]
        
        if (r0 == 0xffffffff)
            r0 = memchr(&r5_1[8], 1, r5_1[7]) - &r5_1[8]
        
        if (zx.d(*(r5_1 + (r0 << 1) + 0x30)) != 0)
            core::CWorldBase::GetInstanceByID(r8_1)
            ascension::CWorld::PlayActiveEffect(r8_1)
        
        int32_t var_24 = 1
        ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
            operator new(0x990), r7_1, arg3, 9, 0)
        CState::AddOwnedChild(arg2)
        CStateList::AppendState(arg2)
        ascension::CWorld::RemoveAcquireHeroFromVoid(r8_1)
        *(arg2 + 0xcec) = 1
        return 
    
    r1 += 1
    r5_1 = &r5_1[0x11]
while (r1 s< arg1)
