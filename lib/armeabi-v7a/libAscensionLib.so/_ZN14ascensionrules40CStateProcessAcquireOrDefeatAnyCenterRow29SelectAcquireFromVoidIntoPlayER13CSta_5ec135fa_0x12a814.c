// 函数: _ZN14ascensionrules40CStateProcessAcquireOrDefeatAnyCenterRow29SelectAcquireFromVoidIntoPlayER13CStateMachineP6CStateiPj
// 地址: 0x12a814
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

arg1 = *(arg2 + 0xcdc)

if (arg1 s< 1)
    return 

ascension::CPlayer* r10_1 = *(arg2 + 0x24c)
int32_t* r5_1 = *(arg2 + 0xce0)
int32_t r1 = 0
ascension::CActiveEffectInstance* r8_1 = *(r10_1 + 4)

do
    if (*r5_1 == arg3)
        void* r7 = r5_1[0x10]
        
        if (r7 == 0xffffffff)
            r7 = memchr(&r5_1[8], 4, r5_1[7]) - &r5_1[8]
        
        uint32_t r1_1 = zx.d(*(r5_1 + r7 + 0x28))
        
        if (r1_1 != 0)
            if (zx.d(*(r8_1 + 0xb3d)) == 0 || *(r8_1 + 0xb48) s< 1)
                ascension::CPlayer::RemoveInsightCount(r10_1)
            else
                uint32_t r0_5 = zx.d(*(r8_1 + 0xb29))
                
                if (r0_5 != 0)
                    r0_5 = 8
                
                ascensionrules::CreateStateMustPayResources(r10_1, arg3, 0, 0, r1_1, r0_5, 8, 0)
                CState::AddOwnedChild(arg2)
                CStateList::AppendState(arg2)
        
        if (zx.d(*(r5_1 + (r7 << 1) + 0x30)) != 0)
            core::CWorldBase::GetInstanceByID(r8_1)
            ascension::CWorld::PlayActiveEffect(r8_1)
        
        int32_t var_34_2 = 4
        ascensionrules::CStateProcessAcquireCardSequence::CStateProcessAcquireCardSequence(
            operator new(0x990), r10_1, arg3, 9, 0)
        CState::AddOwnedChild(arg2)
        CStateList::AppendState(arg2)
        ascension::CWorld::RemoveAcquireHeroFromVoid(r8_1)
        *(arg2 + 0xcec) = 1
        return 
    
    r1 += 1
    r5_1 = &r5_1[0x11]
while (r1 s< arg1)
